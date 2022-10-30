package com.springboot.springboot.handler;

public class CampoObrigatorioException extends BusinessException{


    public CampoObrigatorioException(String campo) {
        super("O %s é obrigatório", campo);
    }


}
