package com.mibarrio.api.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorDTO {
    private String code;
    private String message;
}
