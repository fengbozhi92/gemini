package org.fbz.gemini.manage.controller.common;

import org.fbz.gemini.common.ResultData;
import org.fbz.gemini.dictionary.ResultEnum;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class BaseController {

    public ResponseEntity<ResultData> renderError() {
        return new ResponseEntity<ResultData>(new ResultData(ResultEnum.Error), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<ResultData> renderError(String content) {
        return new ResponseEntity<ResultData>(new ResultData(ResultEnum.Error, content), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<ResultData> renderSuccess() {
        return new ResponseEntity<ResultData>(new ResultData(ResultEnum.Success), HttpStatus.OK);
    }

    public ResponseEntity<ResultData> renderData(Object data) {
        return new ResponseEntity<ResultData>(new ResultData(ResultEnum.Success, data), HttpStatus.OK);
    }
}
