package com.mcddhub.common.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Geo {
    /**
     * 经度，范围为 -180 到 180 度，用于表示地理位置的东西方向
     */
    private Double longitude;

    /**
     * 纬度，范围为 -90 到 90 度，用于表示地理位置的南北方向
     */
    private Double latitude;
}