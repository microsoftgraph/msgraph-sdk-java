package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PayloadIndustry implements ValuedEnum {
    Unknown("unknown"),
    Other("other"),
    Banking("banking"),
    BusinessServices("businessServices"),
    ConsumerServices("consumerServices"),
    Education("education"),
    Energy("energy"),
    Construction("construction"),
    Consulting("consulting"),
    FinancialServices("financialServices"),
    Government("government"),
    Hospitality("hospitality"),
    Insurance("insurance"),
    Legal("legal"),
    CourierServices("courierServices"),
    IT("IT"),
    Healthcare("healthcare"),
    Manufacturing("manufacturing"),
    Retail("retail"),
    Telecom("telecom"),
    RealEstate("realEstate"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PayloadIndustry(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PayloadIndustry forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "other": return Other;
            case "banking": return Banking;
            case "businessServices": return BusinessServices;
            case "consumerServices": return ConsumerServices;
            case "education": return Education;
            case "energy": return Energy;
            case "construction": return Construction;
            case "consulting": return Consulting;
            case "financialServices": return FinancialServices;
            case "government": return Government;
            case "hospitality": return Hospitality;
            case "insurance": return Insurance;
            case "legal": return Legal;
            case "courierServices": return CourierServices;
            case "IT": return IT;
            case "healthcare": return Healthcare;
            case "manufacturing": return Manufacturing;
            case "retail": return Retail;
            case "telecom": return Telecom;
            case "realEstate": return RealEstate;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
