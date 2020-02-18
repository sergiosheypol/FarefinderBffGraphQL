package com.shpl.farefinderbff.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Price {
    private Map<String, String> base;
    private Map<String, String> adjustment;

}
