package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Windows Information Protection Proxied Domain Collection */
public class WindowsInformationProtectionProxiedDomainCollection implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Display name */
    private String _displayName;
    /** The OdataType property */
    private String _odataType;
    /** Collection of proxied domains */
    private java.util.List<ProxiedDomain> _proxiedDomains;
    /**
     * Instantiates a new windowsInformationProtectionProxiedDomainCollection and sets the default values.
     * @return a void
     */
    public WindowsInformationProtectionProxiedDomainCollection() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.windowsInformationProtectionProxiedDomainCollection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsInformationProtectionProxiedDomainCollection
     */
    @javax.annotation.Nonnull
    public static WindowsInformationProtectionProxiedDomainCollection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsInformationProtectionProxiedDomainCollection();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the displayName property value. Display name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsInformationProtectionProxiedDomainCollection currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("proxiedDomains", (n) -> { currentObject.setProxiedDomains(n.getCollectionOfObjectValues(ProxiedDomain::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the proxiedDomains property value. Collection of proxied domains
     * @return a proxiedDomain
     */
    @javax.annotation.Nullable
    public java.util.List<ProxiedDomain> getProxiedDomains() {
        return this._proxiedDomains;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("proxiedDomains", this.getProxiedDomains());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the displayName property value. Display name
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the proxiedDomains property value. Collection of proxied domains
     * @param value Value to set for the proxiedDomains property.
     * @return a void
     */
    public void setProxiedDomains(@javax.annotation.Nullable final java.util.List<ProxiedDomain> value) {
        this._proxiedDomains = value;
    }
}
