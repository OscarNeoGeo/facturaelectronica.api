/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.controllers;

import com.softcorp.cr.facturaelectronica.api.entities.CurrenciesEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/currencies")
public class CurrenciesController extends BaseController {

    @RequestMapping(value = "/get", method = RequestMethod.GET, headers = "Accept=application/json")
    public Iterable<CurrenciesEntity> get() {
        try {
            return currenciesRepository.findAll();
        } catch (Exception e) {
            loggerService.error(e);
            throw e;
        }
    }
}
