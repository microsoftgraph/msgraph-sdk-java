package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TermsOfUseContainer extends Entity implements Parsable {
    /**
     * Instantiates a new {@link TermsOfUseContainer} and sets the default values.
     */
    public TermsOfUseContainer() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TermsOfUseContainer}
     */
    @jakarta.annotation.Nonnull
    public static TermsOfUseContainer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TermsOfUseContainer();
    }
    /**
     * Gets the agreementAcceptances property value. Represents the current status of a user's response to a company's customizable terms of use agreement.
     * @return a {@link java.util.List<AgreementAcceptance>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AgreementAcceptance> getAgreementAcceptances() {
        return this.backingStore.get("agreementAcceptances");
    }
    /**
     * Gets the agreements property value. Represents a tenant's customizable terms of use agreement that's created and managed with Microsoft Entra ID Governance.
     * @return a {@link java.util.List<Agreement>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Agreement> getAgreements() {
        return this.backingStore.get("agreements");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("agreementAcceptances", (n) -> { this.setAgreementAcceptances(n.getCollectionOfObjectValues(AgreementAcceptance::createFromDiscriminatorValue)); });
        deserializerMap.put("agreements", (n) -> { this.setAgreements(n.getCollectionOfObjectValues(Agreement::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("agreementAcceptances", this.getAgreementAcceptances());
        writer.writeCollectionOfObjectValues("agreements", this.getAgreements());
    }
    /**
     * Sets the agreementAcceptances property value. Represents the current status of a user's response to a company's customizable terms of use agreement.
     * @param value Value to set for the agreementAcceptances property.
     */
    public void setAgreementAcceptances(@jakarta.annotation.Nullable final java.util.List<AgreementAcceptance> value) {
        this.backingStore.set("agreementAcceptances", value);
    }
    /**
     * Sets the agreements property value. Represents a tenant's customizable terms of use agreement that's created and managed with Microsoft Entra ID Governance.
     * @param value Value to set for the agreements property.
     */
    public void setAgreements(@jakarta.annotation.Nullable final java.util.List<Agreement> value) {
        this.backingStore.set("agreements", value);
    }
}
