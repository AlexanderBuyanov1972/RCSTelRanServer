//package com.telran.rentcompamyservice.dao;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.telran.rentcompamyservice.entities.ModelRCS;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class JSONParsing {
//    static String newText = "";
//    static String pathFile = "C://Users/alex/Documents/GitHub/RCSTelRanServer/src/main/resources/albar_pricelist.json";
//
//    public static void main(String[] args) throws Exception {
//        File f = new File(pathFile);
//        if (f.exists()) {
//            InputStream is = new FileInputStream(pathFile);
//            byte[] data = new byte[is.available()];
//            is.read(data);
//            newText = matcherJsonForDB(new String(data));
//            System.out.println(newText);
//            System.out.println("*********************************************************************************");
//        } else {
//            System.out.println("file is not exists");
//        }
//        System.out.println("*********************************************************************************");
//        List<ModelRCS> modelsRCS = getArrayModelRCSFromString(newText);
//        System.out.println("modelsRCS---------------->" + modelsRCS);
//
//    }
//
//    private static String matcherJsonForDB(String stringOld) {
//        return stringOld
//                .replace("Super CDW Mothly", "super_cdw_monthly")
//                .replace("Super TP monthly", "super_tp_monthly")
//                .replace("Super CDW", "super_cdw")
//                .replace("Super TP", "super_tp")
//
//                .replace("Car Group", "car_group")
//                .replace("SIPP Code", "sipp_code")
//                .replace("Group sig", "group_sig")
//                .replace("Seats", "seats")
//                .replace("Vehicle Type", "vehicle_type")
//                .replace("Daily(1-2)Low", "daily_1_2_low")
//                .replace("Daily(1-2)High", "daily_1_2_high")
//                .replace("Daily(3-6)Low", "daily_3_6_low")
//                .replace("Daily(3-6)High", "daily_3_6_high")
//                .replace("Weekly-Low", "weekly_low")
//                .replace("Weekly-High", "weekly_high")
//                .replace("Ex. Day (8+)Low", "ex_day_8_plus_low")
//                .replace("Ex. Day (8+)High", "ex_day_8_plus_high")
//                .replace("Month (30+)Low", "month_30_plus_low")
//                .replace("Month (30+)High", "month_30_plus_high")
//                .replace("CDW", "cdw")
//                .replace("TP", "tp")
//                .replace("3PLC", "_3_plc")
//                .replace("Extra KM", "extra_km")
//                .replace("Excess", "excess")
//                .replace("\"\": \"\"", "");
//
//    }
//
//    private static List<ModelRCS> getArrayModelRCSFromString(String string) {
//        List<ModelRCS> modelsRCS = new ArrayList<>();
//        String newStr = string.replaceAll("[\\s]{1,}", "")
//                .replaceAll(",}", "}");
//        String str = newStr.substring(1, newStr.length() - 1).replaceAll("},", "};");
//        String[] lines = str.split(";");
//
//        for (int i = 0; i < lines.length; i++) {
//            ModelRCS modelRCS = getModelRCSFromString(lines[i]);
//            modelsRCS.add(modelRCS);
//        }
//        return modelsRCS;
//    }
//
//    private static ModelRCS getModelRCSFromString(String line) {
//        ObjectMapper mapper = new ObjectMapper();
//        ModelRCS modelRCS = null;
//
//        try {
//            modelRCS = mapper.readValue(line, ModelRCS.class);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("modelRCS---------->" + modelRCS.toString());
//        return modelRCS;
//    }
//
//}