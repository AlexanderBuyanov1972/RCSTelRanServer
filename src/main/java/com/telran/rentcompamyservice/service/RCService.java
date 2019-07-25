package com.telran.rentcompamyservice.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.telran.rentcompamyservice.dao.LocatonBranchesRepository;
import com.telran.rentcompamyservice.dao.ModelsRCSRepository;
import com.telran.rentcompamyservice.dto.Response;
import com.telran.rentcompamyservice.entities.for_calculation.LocationBranch;
import com.telran.rentcompamyservice.entities.ModelRCS;
import com.telran.rentcompamyservice.entities.for_calculation.RequestForGettingPrice;
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
public class RCService implements IRentCompanyService {
    private String pathFilePriceList = "C://Users/alex/Documents/GitHub/RCSTelRanServer/src/main/resources/albar_pricelist.json";
    private String pathFileLocation = "C://Users/alex/Documents/GitHub/RCSTelRanServer/src/main/resources/albar_location.json";
    private int goodCode = 200;
    private String currentDate = LocalDateTime.now().toString();
    private Response response = null;

    @Autowired
    ModelsRCSRepository modelsRCSRepository;
    @Autowired
    LocatonBranchesRepository locatonBranchesRepository;

    // ***************************************calculatePrice*************************************************
    @Override
    public Response calculatePrice(RequestForGettingPrice request) {
        Double priceFinish = 0.0;

        response = new Response().setCode(goodCode).setTimestamp(currentDate);


        return response.setContent(priceFinish).setMessage("OK");
    }

    // ***************************************addJsonModelsRCS*************************************************
    @Override
    public Response addJsonModelsRCS() {
        response = new Response().setCode(goodCode).setTimestamp(currentDate).setContent("");
        String string = getStringFromJson(pathFilePriceList);
        String newString = matcherString(string);
        List<ModelRCS> modelsRCS = getListModelRCSFromString(newString);
        modelsRCSRepository.deleteAll();
        modelsRCS.forEach(x -> modelsRCSRepository.save(x));
        return response.setMessage("OK");
    }

    @Override
    public Response getJsonModelsRCS() {
        response = new Response().setCode(goodCode).setTimestamp(currentDate);
        List<ModelRCS> list = (List<ModelRCS>) modelsRCSRepository.findAll();
        return response.setMessage("OK").setContent(list);
    }

    // ***************************************addJsonLocationBranches*************************************************
    @Override
    public Response addJsonLocationBranches() {
        response = new Response().setCode(goodCode).setTimestamp(currentDate).setContent("");
        String string = getStringFromJson(pathFileLocation);
        String newString = matcherStringLocationBranches(string);
        List<LocationBranch> locationBranches = getListLocationBranchesFromString(newString);
        locatonBranchesRepository.deleteAll();
        locationBranches.forEach(x->locatonBranchesRepository.save(x));
        return response.setMessage("OK");
    }

    @Override
    public Response getJsonLocationBranches() {
        response = new Response().setCode(goodCode).setTimestamp(currentDate);
        List<LocationBranch> list = (List<LocationBranch>) locatonBranchesRepository.findAll();
        return response.setMessage("OK").setContent(list);
    }

    private List<LocationBranch> getListLocationBranchesFromString(String newString) {
        List<LocationBranch> locationBranches = new ArrayList<>();
        String[] lines = newString.split(";");
        for (int i = 0; i < lines.length - 1; i++){
            lines[i] = "{\"city\":" +lines[i];
            LocationBranch locationBranch = getLocationBranchFromString(lines[i]);
            locationBranches.add(locationBranch);
        }
        return locationBranches;
    }



    private String matcherStringLocationBranches(String string) {
        String str1 = string.replaceAll("[\\s]{2,}", "");
        String str2 = str1.substring(15, str1.length()-3);
        return str2.replace(": {", ",")
                .replace("{","").replace(": ", ":").replaceAll("},", "};");
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private String getStringFromJson(String fileName) {
        File f = new File(fileName);
        String newText = "";
        InputStream is = null;
        if (f.exists()) {
            try {
                is = new FileInputStream(fileName);
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
                .replace("Super CDW Mothly", "superCdwMonthly")
                .replace("Super TP monthly", "superTpMonthly")
                .replace("Super CDW", "superCdw")
                .replace("Super TP", "superTp")

                .replace("Car Group", "carGroup")
                .replace("SIPP Code", "sippCode")
                .replace("Group sig", "groupSig")
                .replace("Seats", "seats")
                .replace("Vehicle Type", "vehicleType")
                .replace("Daily(1-2)Low", "daily12Low")
                .replace("Daily(1-2)High", "daily12High")
                .replace("Daily(3-6)Low", "daily36Low")
                .replace("Daily(3-6)High", "daily36High")
                .replace("Weekly-Low", "weeklyLow")
                .replace("Weekly-High", "weeklyHigh")
                .replace("Ex. Day (8+)Low", "exDay8PlusLow")
                .replace("Ex. Day (8+)High", "exDay8PlusHigh")
                .replace("Month (30+)Low", "month30PlusLow")
                .replace("Month (30+)High", "month30PlusHigh")
                .replace("CDW", "cdw")
                .replace("TP", "tp")
                .replace("3PLC", "p3lc")
                .replace("Extra KM", "extraKm")
                .replace("Excess", "excess")
                .replace("\"\": \"\"", "");
    }

    private List<ModelRCS> getListModelRCSFromString(String string) {
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
    private LocationBranch getLocationBranchFromString(String line) {
        ObjectMapper mapper = new ObjectMapper();
        LocationBranch locationBranch = null;
        try {
            locationBranch = mapper.readValue(line, LocationBranch.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return locationBranch;
    }

}
