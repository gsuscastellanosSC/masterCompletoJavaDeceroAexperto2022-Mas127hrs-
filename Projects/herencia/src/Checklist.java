public enum Checklist {

    EMPTY_STRING(""),
    PRODUCT_BENEFICIARY("NEQREMBEN"),
    PRODUCT_PAYER("NEQREMORD"),
    PRODUCT_COUNTRY("NEQREMPAIS"),
    REJECT_MSG_BENEFICIARY("Beneficiary does not comply with own policies"),
    REJECT_MSG_PAYER("Payer does not comply with own policies"),
    REJECT_MSG_PAYER_COUNTRY("Payer Country does not comply with own policies"),
    RETRY_MSG_PAYER("Retry by Technical error validating payer"),
    RETRY_MSG_BENEFICIARY("Retry by Technical error validating beneficiary");
    private final String name;

    Checklists(String name) {
        this.name = name;
    }

    private Mono<Boolean> todo(String value) {

        return Mono.just(Boolean.FALSE);
    }
}
