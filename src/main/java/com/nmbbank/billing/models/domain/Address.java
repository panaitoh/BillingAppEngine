/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nmbbank.billing.models.domain;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author Paul George Msegeya <paul.msegeya@nmbtz.com> <msegeya@gmail.com>
 * <paul.msegeya@gmail.com>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address {

    private String id;

    private String email;

    private String phoneNumber;

    private String address;

    private String city;

    private String region;

    private String postalCode;

    private String country;

    private Date updatedAt;

}
