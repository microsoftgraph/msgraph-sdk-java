package com.microsoft.graph.devicemanagement.exchangeconnectors.item.sync;

import com.microsoft.graph.models.DeviceManagementExchangeConnectorSyncType;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the sync method. */
public class SyncPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The type of Exchange Connector sync requested. */
    private DeviceManagementExchangeConnectorSyncType _syncType;
    /**
     * Instantiates a new syncPostRequestBody and sets the default values.
     * @return a void
     */
    public SyncPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a syncPostRequestBody
     */
    @javax.annotation.Nonnull
    public static SyncPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SyncPostRequestBody();
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
        final SyncPostRequestBody currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(1) {{
            this.put("syncType", (n) -> { currentObject.setSyncType(n.getEnumValue(DeviceManagementExchangeConnectorSyncType.class)); });
        }};
    }
    /**
     * Gets the syncType property value. The type of Exchange Connector sync requested.
     * @return a deviceManagementExchangeConnectorSyncType
     */
    @javax.annotation.Nullable
    public DeviceManagementExchangeConnectorSyncType getSyncType() {
        return this._syncType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("syncType", this.getSyncType());
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
     * Sets the syncType property value. The type of Exchange Connector sync requested.
     * @param value Value to set for the syncType property.
     * @return a void
     */
    public void setSyncType(@javax.annotation.Nullable final DeviceManagementExchangeConnectorSyncType value) {
        this._syncType = value;
    }
}
