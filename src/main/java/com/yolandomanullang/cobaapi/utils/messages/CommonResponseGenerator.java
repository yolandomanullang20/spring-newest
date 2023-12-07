package com.yolandomanullang.cobaapi.utils.messages;

import org.springframework.stereotype.Component;

@Component
public class CommonResponseGenerator<T> {
    public CommonResponse<T> commonSuccessResponse(T wrapper, String detail) {
        CommonResponse<T> commonResponse = new CommonResponse<>();
        commonResponse.setStatus(200);
        commonResponse.setMessage("SUCCESS");
        if (detail != null) commonResponse.setDetail(detail);
        else commonResponse.setDetail("SUCCESS");
        commonResponse.setDatas(wrapper);

        return commonResponse;
    }

}
