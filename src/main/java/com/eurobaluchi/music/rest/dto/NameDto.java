package com.eurobaluchi.music.rest.dto;

import com.eurobaluchi.music.rest.utils.Utils;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class NameDto {

    @NotBlank(message = Utils.LATIN + Utils.CAN_NOT_BE_NULL_OR_EMPTY)
    private String latin;

    @NotBlank(message = Utils.ENGLISH + Utils.CAN_NOT_BE_NULL_OR_EMPTY)
    private String english;

    @NotBlank(message = Utils.FARSI + Utils.CAN_NOT_BE_NULL_OR_EMPTY)
    private String farsi;

    @NotBlank(message = Utils.URDU + Utils.CAN_NOT_BE_NULL_OR_EMPTY)
    private String urdu;

    @NotBlank(message = Utils.DEVANAGARI + Utils.CAN_NOT_BE_NULL_OR_EMPTY)
    private String devanagari;

    public NameDto(String latin, String english, String farsi, String urdu, String devanagari) {
        this.latin = latin;
        this.english = english;
        this.farsi = farsi;
        this.urdu = urdu;
        this.devanagari = devanagari;
    }
}
