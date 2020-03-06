/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.signer;

import java.security.cert.X509Certificate;
import xades4j.providers.impl.KeyStoreKeyingDataProvider;

public class DirectPasswordProvider
        implements KeyStoreKeyingDataProvider.KeyStorePasswordProvider, KeyStoreKeyingDataProvider.KeyEntryPasswordProvider
{
    private String password;

    DirectPasswordProvider(String password) { this.password = password; }


    public char[] getPassword() { return this.password.toCharArray(); }


    public char[] getPassword(String entryAlias, X509Certificate entryCert) { return this.password.toCharArray(); }
}
