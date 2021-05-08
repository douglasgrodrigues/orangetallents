package com.douglas.orangechallenge.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class FieldsError  {

    String mensagem;
    List<String> campos;

    public FieldsError(String message, List<String> fieldsErros) {
        this.mensagem = message;
        this.campos = fieldsErros;
    }

    public String getMensagem() {
        return this.mensagem;
    }

    public List<String> getCampos() {
        return this.campos;
    }
}