package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SynchronizationJobRestartCriteria implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Comma-separated combination of the following values: None, ConnectorDataStore, Escrows, Watermark, QuarantineState, Full, ForceDeletes. The property can also be empty.   None: Starts a paused or quarantined provisioning job. DO NOT USE. Use the Start synchronizationJob API instead.ConnectorDataStore - Clears the underlying cache for all users. DO NOT USE. Contact Microsoft Support for guidance.Escrows - Provisioning failures are marked as escrows and retried. Clearing escrows will stop the service from retrying failures.Watermark - Removing the watermark causes the service to re-evaluate all the users again, rather than just processing changes.QuarantineState - Temporarily lifts the quarantine.Use Full if you want all of the options.ForceDeletes - Forces the system to delete the pending deleted users when using the accidental deletions prevention feature and the deletion threshold is exceeded. Leaving this property empty emulates the Restart provisioning option in the Azure portal. It is similar to setting the resetScope to include QuarantineState, Watermark, and Escrows. This option meets most customer needs.
     */
    private EnumSet<SynchronizationJobRestartScope> resetScope;
    /**
     * Instantiates a new synchronizationJobRestartCriteria and sets the default values.
     */
    public SynchronizationJobRestartCriteria() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a synchronizationJobRestartCriteria
     */
    @jakarta.annotation.Nonnull
    public static SynchronizationJobRestartCriteria createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationJobRestartCriteria();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("resetScope", (n) -> { this.setResetScope(n.getEnumSetValue(SynchronizationJobRestartScope.class)); });
        return deserializerMap;
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
     * Gets the resetScope property value. Comma-separated combination of the following values: None, ConnectorDataStore, Escrows, Watermark, QuarantineState, Full, ForceDeletes. The property can also be empty.   None: Starts a paused or quarantined provisioning job. DO NOT USE. Use the Start synchronizationJob API instead.ConnectorDataStore - Clears the underlying cache for all users. DO NOT USE. Contact Microsoft Support for guidance.Escrows - Provisioning failures are marked as escrows and retried. Clearing escrows will stop the service from retrying failures.Watermark - Removing the watermark causes the service to re-evaluate all the users again, rather than just processing changes.QuarantineState - Temporarily lifts the quarantine.Use Full if you want all of the options.ForceDeletes - Forces the system to delete the pending deleted users when using the accidental deletions prevention feature and the deletion threshold is exceeded. Leaving this property empty emulates the Restart provisioning option in the Azure portal. It is similar to setting the resetScope to include QuarantineState, Watermark, and Escrows. This option meets most customer needs.
     * @return a synchronizationJobRestartScope
     */
    @jakarta.annotation.Nullable
    public EnumSet<SynchronizationJobRestartScope> getResetScope() {
        return this.resetScope;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumSetValue("resetScope", this.getResetScope());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the resetScope property value. Comma-separated combination of the following values: None, ConnectorDataStore, Escrows, Watermark, QuarantineState, Full, ForceDeletes. The property can also be empty.   None: Starts a paused or quarantined provisioning job. DO NOT USE. Use the Start synchronizationJob API instead.ConnectorDataStore - Clears the underlying cache for all users. DO NOT USE. Contact Microsoft Support for guidance.Escrows - Provisioning failures are marked as escrows and retried. Clearing escrows will stop the service from retrying failures.Watermark - Removing the watermark causes the service to re-evaluate all the users again, rather than just processing changes.QuarantineState - Temporarily lifts the quarantine.Use Full if you want all of the options.ForceDeletes - Forces the system to delete the pending deleted users when using the accidental deletions prevention feature and the deletion threshold is exceeded. Leaving this property empty emulates the Restart provisioning option in the Azure portal. It is similar to setting the resetScope to include QuarantineState, Watermark, and Escrows. This option meets most customer needs.
     * @param value Value to set for the resetScope property.
     */
    public void setResetScope(@jakarta.annotation.Nullable final EnumSet<SynchronizationJobRestartScope> value) {
        this.resetScope = value;
    }
}
