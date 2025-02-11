package com.example.ccmsreportes.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class ResponseReporte {
    @SerializedName("resultado")
    @Expose
    private Integer resultado;
    @SerializedName("msg")
    @Expose
    private String msg;

    public Integer getResultado() {
        return resultado;
    }

    public void setResultado(Integer resultado) {
        this.resultado = resultado;
    }

    public ResponseReporte withResultado(Integer resultado) {
        this.resultado = resultado;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ResponseReporte withMsg(String msg) {
        this.msg = msg;
        return this;
    }
}