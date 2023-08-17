package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Network Usage Rules allow enterprises to specify how managed apps use networks, such as cellular data networks.
 */
public class IosNetworkUsageRule implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * If set to true, corresponding managed apps will not be allowed to use cellular data at any time.
     */
    private Boolean cellularDataBlocked;
    /**
     * If set to true, corresponding managed apps will not be allowed to use cellular data when roaming.
     */
    private Boolean cellularDataBlockWhenRoaming;
    /**
     * Information about the managed apps that this rule is going to apply to. This collection can contain a maximum of 500 elements.
     */
    private java.util.List<AppListItem> managedApps;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new iosNetworkUsageRule and sets the default values.
     */
    public IosNetworkUsageRule() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iosNetworkUsageRule
     */
    @jakarta.annotation.Nonnull
    public static IosNetworkUsageRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosNetworkUsageRule();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the cellularDataBlocked property value. If set to true, corresponding managed apps will not be allowed to use cellular data at any time.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCellularDataBlocked() {
        return this.cellularDataBlocked;
    }
    /**
     * Gets the cellularDataBlockWhenRoaming property value. If set to true, corresponding managed apps will not be allowed to use cellular data when roaming.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCellularDataBlockWhenRoaming() {
        return this.cellularDataBlockWhenRoaming;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("cellularDataBlocked", (n) -> { this.setCellularDataBlocked(n.getBooleanValue()); });
        deserializerMap.put("cellularDataBlockWhenRoaming", (n) -> { this.setCellularDataBlockWhenRoaming(n.getBooleanValue()); });
        deserializerMap.put("managedApps", (n) -> { this.setManagedApps(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the managedApps property value. Information about the managed apps that this rule is going to apply to. This collection can contain a maximum of 500 elements.
     * @return a appListItem
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppListItem> getManagedApps() {
        return this.managedApps;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("cellularDataBlocked", this.getCellularDataBlocked());
        writer.writeBooleanValue("cellularDataBlockWhenRoaming", this.getCellularDataBlockWhenRoaming());
        writer.writeCollectionOfObjectValues("managedApps", this.getManagedApps());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the cellularDataBlocked property value. If set to true, corresponding managed apps will not be allowed to use cellular data at any time.
     * @param value Value to set for the cellularDataBlocked property.
     */
    public void setCellularDataBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.cellularDataBlocked = value;
    }
    /**
     * Sets the cellularDataBlockWhenRoaming property value. If set to true, corresponding managed apps will not be allowed to use cellular data when roaming.
     * @param value Value to set for the cellularDataBlockWhenRoaming property.
     */
    public void setCellularDataBlockWhenRoaming(@jakarta.annotation.Nullable final Boolean value) {
        this.cellularDataBlockWhenRoaming = value;
    }
    /**
     * Sets the managedApps property value. Information about the managed apps that this rule is going to apply to. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the managedApps property.
     */
    public void setManagedApps(@jakarta.annotation.Nullable final java.util.List<AppListItem> value) {
        this.managedApps = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
