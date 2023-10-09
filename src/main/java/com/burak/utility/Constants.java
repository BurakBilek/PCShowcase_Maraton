package com.burak.utility;

import com.burak.repository.entity.BaseEntity;

public class Constants {

    public static BaseEntity getBaseEntity(){
        return BaseEntity.builder()
                .createAt(System.currentTimeMillis())
                .updateAt(System.currentTimeMillis())
                .state(true)
                .build();
    }//her defasında baseEntity cıkıcağı için önümüze hazır olsun diye böyle yaptık.


}
