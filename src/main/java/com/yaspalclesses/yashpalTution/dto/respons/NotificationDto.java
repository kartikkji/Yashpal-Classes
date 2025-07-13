package com.yaspalclesses.yashpalTution.dto.respons;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NotificationDto {

    private String title;
    private String message;
    private LocalDate date;

}
