package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TermsOfUseContainer extends Entity implements Parsable {
    /**
     * Represents the current status of a user's response to a company's customizable terms of use agreement.
     */
    private java.util.List<AgreementAcceptance> agreementAcceptances;
    /**
     * Represents a tenant's customizable terms of use agreement that's created and managed with Azure Active Directory (Azure AD).
     */
    private java.util.List<Agreement> agreements;
    /**
     * Instantiates a new termsOfUseContainer and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TermsOfUseContainer() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a termsOfUseContainer
     */
    @javax.annotation.Nonnull
    public static TermsOfUseContainer createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TermsOfUseContainer();
    }
    /**
     * Gets the agreementAcceptances property value. Represents the current status of a user's response to a company's customizable terms of use agreement.
     * @return a agreementAcceptance
     */
    @javax.annotation.Nullable
    public java.util.List<AgreementAcceptance> getAgreementAcceptances() {
        return this.agreementAcceptances;
    }
    /**
     * Gets the agreements property value. Represents a tenant's customizable terms of use agreement that's created and managed with Azure Active Directory (Azure AD).
     * @return a agreement
     */
    @javax.annotation.Nullable
    public java.util.List<Agreement> getAgreements() {
        return this.agreements;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("agreementAcceptances", (n) -> { this.setAgreementAcceptances(n.getCollectionOfObjectValues(AgreementAcceptance::createFromDiscriminatorValue)); });
        deserializerMap.put("agreements", (n) -> { this.setAgreements(n.getCollectionOfObjectValues(Agreement::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("agreementAcceptances", this.getAgreementAcceptances());
        writer.writeCollectionOfObjectValues("agreements", this.getAgreements());
    }
    /**
     * Sets the agreementAcceptances property value. Represents the current status of a user's response to a company's customizable terms of use agreement.
     * @param value Value to set for the agreementAcceptances property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAgreementAcceptances(@javax.annotation.Nullable final java.util.List<AgreementAcceptance> value) {
        this.agreementAcceptances = value;
    }
    /**
     * Sets the agreements property value. Represents a tenant's customizable terms of use agreement that's created and managed with Azure Active Directory (Azure AD).
     * @param value Value to set for the agreements property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAgreements(@javax.annotation.Nullable final java.util.List<Agreement> value) {
        this.agreements = value;
    }
}
