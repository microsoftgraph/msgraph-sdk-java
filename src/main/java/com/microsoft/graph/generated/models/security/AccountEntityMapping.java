package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccountEntityMapping extends EntityMapping implements Parsable {
    /**
     * Instantiates a new {@link AccountEntityMapping} and sets the default values.
     */
    public AccountEntityMapping() {
        super();
        this.setOdataType("#microsoft.graph.security.accountEntityMapping");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccountEntityMapping}
     */
    @jakarta.annotation.Nonnull
    public static AccountEntityMapping createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccountEntityMapping();
    }
    /**
     * Gets the aadUserIdColumn property value. Name of the detection query column that maps to the Microsoft Entra user ID of the alert entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAadUserIdColumn() {
        return this.backingStore.get("aadUserIdColumn");
    }
    /**
     * Gets the dnsDomainColumn property value. Name of the detection query column that maps to the DNS domain of the alert entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDnsDomainColumn() {
        return this.backingStore.get("dnsDomainColumn");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("aadUserIdColumn", (n) -> { this.setAadUserIdColumn(n.getStringValue()); });
        deserializerMap.put("dnsDomainColumn", (n) -> { this.setDnsDomainColumn(n.getStringValue()); });
        deserializerMap.put("nameColumn", (n) -> { this.setNameColumn(n.getStringValue()); });
        deserializerMap.put("ntDomainColumn", (n) -> { this.setNtDomainColumn(n.getStringValue()); });
        deserializerMap.put("sidColumn", (n) -> { this.setSidColumn(n.getStringValue()); });
        deserializerMap.put("upnColumn", (n) -> { this.setUpnColumn(n.getStringValue()); });
        deserializerMap.put("upnSuffixColumn", (n) -> { this.setUpnSuffixColumn(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the nameColumn property value. Name of the detection query column that maps to the name of the alert entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNameColumn() {
        return this.backingStore.get("nameColumn");
    }
    /**
     * Gets the ntDomainColumn property value. Name of the detection query column that maps to the NT domain of the alert entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNtDomainColumn() {
        return this.backingStore.get("ntDomainColumn");
    }
    /**
     * Gets the sidColumn property value. Name of the detection query column that maps to the security identifier (SID) of the alert entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSidColumn() {
        return this.backingStore.get("sidColumn");
    }
    /**
     * Gets the upnColumn property value. Name of the detection query column that maps to the user principal name (UPN) of the alert entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUpnColumn() {
        return this.backingStore.get("upnColumn");
    }
    /**
     * Gets the upnSuffixColumn property value. Name of the detection query column that maps to the UPN suffix of the alert entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUpnSuffixColumn() {
        return this.backingStore.get("upnSuffixColumn");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("aadUserIdColumn", this.getAadUserIdColumn());
        writer.writeStringValue("dnsDomainColumn", this.getDnsDomainColumn());
        writer.writeStringValue("nameColumn", this.getNameColumn());
        writer.writeStringValue("ntDomainColumn", this.getNtDomainColumn());
        writer.writeStringValue("sidColumn", this.getSidColumn());
        writer.writeStringValue("upnColumn", this.getUpnColumn());
        writer.writeStringValue("upnSuffixColumn", this.getUpnSuffixColumn());
    }
    /**
     * Sets the aadUserIdColumn property value. Name of the detection query column that maps to the Microsoft Entra user ID of the alert entity.
     * @param value Value to set for the aadUserIdColumn property.
     */
    public void setAadUserIdColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("aadUserIdColumn", value);
    }
    /**
     * Sets the dnsDomainColumn property value. Name of the detection query column that maps to the DNS domain of the alert entity.
     * @param value Value to set for the dnsDomainColumn property.
     */
    public void setDnsDomainColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("dnsDomainColumn", value);
    }
    /**
     * Sets the nameColumn property value. Name of the detection query column that maps to the name of the alert entity.
     * @param value Value to set for the nameColumn property.
     */
    public void setNameColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("nameColumn", value);
    }
    /**
     * Sets the ntDomainColumn property value. Name of the detection query column that maps to the NT domain of the alert entity.
     * @param value Value to set for the ntDomainColumn property.
     */
    public void setNtDomainColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ntDomainColumn", value);
    }
    /**
     * Sets the sidColumn property value. Name of the detection query column that maps to the security identifier (SID) of the alert entity.
     * @param value Value to set for the sidColumn property.
     */
    public void setSidColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sidColumn", value);
    }
    /**
     * Sets the upnColumn property value. Name of the detection query column that maps to the user principal name (UPN) of the alert entity.
     * @param value Value to set for the upnColumn property.
     */
    public void setUpnColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("upnColumn", value);
    }
    /**
     * Sets the upnSuffixColumn property value. Name of the detection query column that maps to the UPN suffix of the alert entity.
     * @param value Value to set for the upnSuffixColumn property.
     */
    public void setUpnSuffixColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("upnSuffixColumn", value);
    }
}
