package com.ortec.gta.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @Author: romain.pillot
 * @Date: 03/10/2017
 */
@Accessors(chain = true)
@Getter @Setter
public class AbsenceDayDTO {
    private long userId;
    private int year;
    private int day;
    private int week_number;
    private float absence_value;
    private String absence_type;
}
