package com.telran.rentcompamyservice.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.telran.rentcompamyservice.dao.ModelsRCSRepository;
import com.telran.rentcompamyservice.dto.Request;
import com.telran.rentcompamyservice.dto.Response;
import com.telran.rentcompamyservice.entities.ModelRCS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class RCService {
    String pathFile = "C://Users/alex/Documents/GitHub/RCSTelRanServer/src/main/resources/albar_pricelist.json";

    @Autowired
    ModelsRCSRepository modelsRCSRepository;

    private int goodCode = 200;
    private String currentDate = LocalDateTime.now().toString();
    private Response response = null;

    public Response calculatePrice(Request request) {
        response = new Response().setCode(goodCode).setTimestamp(currentDate);
        return response.setContent(request.getName1() + request.getName2() + request.getName3()).setMessage("OK");
    }

    public Response addJsonModelsRCS() {
        response = new Response().setCode(goodCode).setTimestamp(currentDate);
        String string = getStringFromJson();
        String newString = matcherString(string);
        List<ModelRCS> modelsRCS = getArrayModelRCSFromString(newString);
        modelsRCSRepository.deleteAll();
        modelsRCS.forEach(x -> modelsRCSRepository.save(x));
        return response.setMessage("OK").setContent(modelsRCSRepository.findAll());
    }

    private String getStringFromJson() {
        File f = new File(pathFile);
        String newText = "";
        InputStream is = null;
        if (f.exists()) {
            try {
                is = new FileInputStream(pathFile);
                byte[] data = new byte[is.available()];
                is.read(data);
                newText = new String(data);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return newText;
    }

    private String matcherString(String stringOld) {
        return stringOld
                .replace("Super CDW Mothly", "super_cdw_monthly")
                .replace("Super TP monthly", "super_tp_monthly")
                .replace("Super CDW", "super_cdw")
                .replace("Super TP", "super_tp")

                .replace("Car Group", "car_group")
                .replace("SIPP Code", "sipp_code")
                .replace("Group sig", "group_sig")
                .replace("Seats", "seats")
                .replace("Vehicle Type", "vehicle_type")
                .replace("Daily(1-2)Low", "daily_1_2_low")
                .replace("Daily(1-2)High", "daily_1_2_high")
                .replace("Daily(3-6)Low", "daily_3_6_low")
                .replace("Daily(3-6)High", "daily_3_6_high")
                .replace("Weekly-Low", "weekly_low")
                .replace("Weekly-High", "weekly_high")
                .replace("Ex. Day (8+)Low", "ex_day_8_plus_low")
                .replace("Ex. Day (8+)High", "ex_day_8_plus_high")
                .replace("Month (30+)Low", "month_30_plus_low")
                .replace("Month (30+)High", "month_30_plus_high")
                .replace("CDW", "cdw")
                .replace("TP", "tp")
                .replace("3PLC", "_3_plc")
                .replace("Extra KM", "extra_km")
                .replace("Excess", "excess")
                .replace("\"\": \"\"", "");
    }

    private List<ModelRCS> getArrayModelRCSFromString(String string) {
        List<ModelRCS> modelsRCS = new ArrayList<>();
        String newStr = string.replaceAll("[\\s]{1,}", "")
                .replaceAll(",}", "}");
        String str = newStr.substring(1, newStr.length() - 1).replaceAll("},", "};");
        String[] lines = str.split(";");
        for (int i = 0; i < lines.length; i++) {
            ModelRCS modelRCS = getModelRCSFromString(lines[i]);
            modelsRCS.add(modelRCS);
        }
        return modelsRCS;
    }

    private ModelRCS getModelRCSFromString(String line) {
        ObjectMapper mapper = new ObjectMapper();
        ModelRCS modelRCS = null;
        try {
            modelRCS = mapper.readValue(line, ModelRCS.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return modelRCS;
    }


}
