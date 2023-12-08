package dto;

import lombok.Data;

import java.util.Date;
@Data
public class InsertDto {
    String name;
    Date insertDate;
    String age;
}
