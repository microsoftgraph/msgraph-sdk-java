package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RoleManagement implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The directory property
     */
    private RbacApplication directory;
    /**
     * Container for roles and assignments for entitlement management resources.
     */
    private RbacApplication entitlementManagement;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new RoleManagement and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RoleManagement() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RoleManagement
     */
    @javax.annotation.Nonnull
    public static RoleManagement createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RoleManagement();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the directory property value. The directory property
     * @return a rbacApplication
     */
    @javax.annotation.Nullable
    public RbacApplication getDirectory() {
        return this.directory;
    }
    /**
     * Gets the entitlementManagement property value. Container for roles and assignments for entitlement management resources.
     * @return a rbacApplication
     */
    @javax.annotation.Nullable
    public RbacApplication getEntitlementManagement() {
        return this.entitlementManagement;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("directory", (n) -> { this.setDirectory(n.getObjectValue(RbacApplication::createFromDiscriminatorValue)); });
        deserializerMap.put("entitlementManagement", (n) -> { this.setEntitlementManagement(n.getObjectValue(RbacApplication::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("directory", this.getDirectory());
        writer.writeObjectValue("entitlementManagement", this.getEntitlementManagement());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the directory property value. The directory property
     * @param value Value to set for the directory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDirectory(@javax.annotation.Nullable final RbacApplication value) {
        this.directory = value;
    }
    /**
     * Sets the entitlementManagement property value. Container for roles and assignments for entitlement management resources.
     * @param value Value to set for the entitlementManagement property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEntitlementManagement(@javax.annotation.Nullable final RbacApplication value) {
        this.entitlementManagement = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
