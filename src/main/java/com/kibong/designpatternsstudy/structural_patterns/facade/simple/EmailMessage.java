package com.kibong.designpatternsstudy.structural_patterns.facade.simple;

import lombok.Data;

@Data
public class EmailMessage {

    private String from;
    private String to;
    private String subject;
    private String text;
}
