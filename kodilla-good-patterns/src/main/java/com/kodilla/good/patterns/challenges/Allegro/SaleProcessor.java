package com.kodilla.good.patterns.challenges.Allegro;

public class SaleProcessor {

    private InformationService informationService;
    private SaleService saleService;
    private SaleRegister saleRegister;

    public SaleProcessor(final InformationService informationService,
                         final SaleService rentalService,
                         final SaleRegister saleRegister) {
        this.informationService = informationService;
        this.saleService = rentalService;
        this.saleRegister = saleRegister;
    }

    public SaleDto process(final SaleRequest saleRequest) {
        boolean isSold = saleService.sell(saleRequest.getUser(), saleRequest.getPaymentStatus(),
                saleRequest.getAuction());

        if (isSold) {
            informationService.inform(saleRequest.getUser());
            saleRegister.registerSale(saleRequest.getUser(), saleRequest.getPaymentStatus(), saleRequest.getAuction());
            return new SaleDto(saleRequest.getUser(), true);
        } else {
            return new SaleDto(saleRequest.getUser(), false);
        }
    }
}
