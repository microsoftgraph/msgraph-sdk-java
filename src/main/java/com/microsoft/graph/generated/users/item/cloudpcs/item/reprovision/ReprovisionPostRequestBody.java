package com.microsoft.graph.users.item.cloudpcs.item.reprovision;

import com.microsoft.graph.models.CloudPcOperatingSystem;
import com.microsoft.graph.models.CloudPcUserAccountType;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReprovisionPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ReprovisionPostRequestBody} and sets the default values.
     */
    public ReprovisionPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ReprovisionPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static ReprovisionPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReprovisionPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("osVersion", (n) -> { this.setOsVersion(n.getEnumValue(CloudPcOperatingSystem::forValue)); });
        deserializerMap.put("userAccountType", (n) -> { this.setUserAccountType(n.getEnumValue(CloudPcUserAccountType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the osVersion property value. The osVersion property
     * @return a {@link CloudPcOperatingSystem}
     */
    @jakarta.annotation.Nullable
    public CloudPcOperatingSystem getOsVersion() {
        return this.backingStore.get("osVersion");
    }
    /**
     * Gets the userAccountType property value. The userAccountType property
     * @return a {@link CloudPcUserAccountType}
     */
    @jakarta.annotation.Nullable
    public CloudPcUserAccountType getUserAccountType() {
        return this.backingStore.get("userAccountType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("osVersion", this.getOsVersion());
        writer.writeEnumValue("userAccountType", this.getUserAccountType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the osVersion property value. The osVersion property
     * @param value Value to set for the osVersion property.
     */
    public void setOsVersion(@jakarta.annotation.Nullable final CloudPcOperatingSystem value) {
        this.backingStore.set("osVersion", value);
    }
    /**
     * Sets the userAccountType property value. The userAccountType property
     * @param value Value to set for the userAccountType property.
     */
    public void setUserAccountType(@jakarta.annotation.Nullable final CloudPcUserAccountType value) {
        this.backingStore.set("userAccountType", value);
    }
}
