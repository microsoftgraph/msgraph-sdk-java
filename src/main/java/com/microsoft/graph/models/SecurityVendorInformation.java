package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SecurityVendorInformation implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Specific provider (product/service - not vendor company); for example, WindowsDefenderATP. */
    private String _provider;
    /** Version of the provider or subprovider, if it exists, that generated the alert. Required */
    private String _providerVersion;
    /** Specific subprovider (under aggregating provider); for example, WindowsDefenderATP.SmartScreen. */
    private String _subProvider;
    /** Name of the alert vendor (for example, Microsoft, Dell, FireEye). Required */
    private String _vendor;
    /**
     * Instantiates a new securityVendorInformation and sets the default values.
     * @return a void
     */
    public SecurityVendorInformation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a securityVendorInformation
     */
    @javax.annotation.Nonnull
    public static SecurityVendorInformation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecurityVendorInformation();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SecurityVendorInformation currentObject = this;
        return new HashMap<>(4) {{
            this.put("provider", (n) -> { currentObject.setProvider(n.getStringValue()); });
            this.put("providerVersion", (n) -> { currentObject.setProviderVersion(n.getStringValue()); });
            this.put("subProvider", (n) -> { currentObject.setSubProvider(n.getStringValue()); });
            this.put("vendor", (n) -> { currentObject.setVendor(n.getStringValue()); });
        }};
    }
    /**
     * Gets the provider property value. Specific provider (product/service - not vendor company); for example, WindowsDefenderATP.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProvider() {
        return this._provider;
    }
    /**
     * Gets the providerVersion property value. Version of the provider or subprovider, if it exists, that generated the alert. Required
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProviderVersion() {
        return this._providerVersion;
    }
    /**
     * Gets the subProvider property value. Specific subprovider (under aggregating provider); for example, WindowsDefenderATP.SmartScreen.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubProvider() {
        return this._subProvider;
    }
    /**
     * Gets the vendor property value. Name of the alert vendor (for example, Microsoft, Dell, FireEye). Required
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVendor() {
        return this._vendor;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("provider", this.getProvider());
        writer.writeStringValue("providerVersion", this.getProviderVersion());
        writer.writeStringValue("subProvider", this.getSubProvider());
        writer.writeStringValue("vendor", this.getVendor());
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
     * Sets the provider property value. Specific provider (product/service - not vendor company); for example, WindowsDefenderATP.
     * @param value Value to set for the provider property.
     * @return a void
     */
    public void setProvider(@javax.annotation.Nullable final String value) {
        this._provider = value;
    }
    /**
     * Sets the providerVersion property value. Version of the provider or subprovider, if it exists, that generated the alert. Required
     * @param value Value to set for the providerVersion property.
     * @return a void
     */
    public void setProviderVersion(@javax.annotation.Nullable final String value) {
        this._providerVersion = value;
    }
    /**
     * Sets the subProvider property value. Specific subprovider (under aggregating provider); for example, WindowsDefenderATP.SmartScreen.
     * @param value Value to set for the subProvider property.
     * @return a void
     */
    public void setSubProvider(@javax.annotation.Nullable final String value) {
        this._subProvider = value;
    }
    /**
     * Sets the vendor property value. Name of the alert vendor (for example, Microsoft, Dell, FireEye). Required
     * @param value Value to set for the vendor property.
     * @return a void
     */
    public void setVendor(@javax.annotation.Nullable final String value) {
        this._vendor = value;
    }
}
