

package com.softcorp.cr.facturaelectronica.api.signer;

import java.security.cert.X509Certificate;
import java.util.List;
import xades4j.providers.impl.KeyStoreKeyingDataProvider;

public class FirstCertificateSelector
        implements KeyStoreKeyingDataProvider.SigningCertSelector
{
    public X509Certificate selectCertificate(List<X509Certificate> availableCertificates) { return (X509Certificate)availableCertificates.get(0); }
}
