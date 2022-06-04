package com.example.restaurant.naver.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchImageReq {

    private String query = "";

    private int display = 10;

    private int start = 1;

    private String sort = "sim";

    private String  filter = "all";

    public MultiValueMap<String, String> toMultiValueMap(){
        var map = new LinkedMultiValueMap<String, String>();

        map.add("query",query);
        map.add("display", String.valueOf(display)); // int 값이므로 변환 해줘야함
        map.add("start", String.valueOf(start)); // int 값이므로 변환 해줘야함
        map.add("sort",sort);
        map.add("filter",filter);


        return map;
    }

}
