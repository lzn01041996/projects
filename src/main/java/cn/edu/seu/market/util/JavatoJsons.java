package cn.edu.seu.market.util;/*
@李子宁
Happy,happy everyday!
冲鸭！
*/

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class JavatoJsons {
    //取出文件内容，填充对象
    public static void main(String[] args) {
        //创建json解析器
        JsonParser  parser = new JsonParser();
        try{
            //创建jsonObject对象
            JsonArray  json = (JsonArray) parser.parse(new FileReader("D:\\BaiduYunDownload\\html\\json\\pie.json"));

            System.out.println(json.get(1));
            JsonObject element = (JsonObject) json.get(1);
            System.out.println(element);
            String name = element.get("name").getAsString();
            System.out.println(element.get("y").getAsDouble());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
