package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DelegatedAdminServiceManagementDetail extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DelegatedAdminServiceManagementDetail} and sets the default values.
     */
    public DelegatedAdminServiceManagementDetail() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DelegatedAdminServiceManagementDetail}
     */
    @jakarta.annotation.Nonnull
    public static DelegatedAdminServiceManagementDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DelegatedAdminServiceManagementDetail();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("serviceManagementUrl", (n) -> { this.setServiceManagementUrl(n.getStringValue()); });
        deserializerMap.put("serviceName", (n) -> { this.setServiceName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the serviceManagementUrl property value. The URL of the management portal for the managed service. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServiceManagementUrl() {
        return this.backingStore.get("serviceManagementUrl");
    }
    /**
     * Gets the serviceName property value. The name of a managed service. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServiceName() {
        return this.backingStore.get("serviceName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("serviceManagementUrl", this.getServiceManagementUrl());
        writer.writeStringValue("serviceName", this.getServiceName());
    }
    /**
     * Sets the serviceManagementUrl property value. The URL of the management portal for the managed service. Read-only.
     * @param value Value to set for the serviceManagementUrl property.
     */
    public void setServiceManagementUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("serviceManagementUrl", value);
    }
    /**
     * Sets the serviceName property value. The name of a managed service. Read-only.
     * @param value Value to set for the serviceName property.
     */
    public void setServiceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("serviceName", value);
    }
}
