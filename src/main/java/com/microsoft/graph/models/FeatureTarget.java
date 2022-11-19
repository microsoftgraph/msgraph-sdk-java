package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class FeatureTarget implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The ID of the entity that's targeted in the include or exclude rule, or all_users to target all users. */
    private String _id;
    /** The OdataType property */
    private String _odataType;
    /** The kind of entity that's targeted. The possible values are: group, administrativeUnit, role, unknownFutureValue. */
    private FeatureTargetType _targetType;
    /**
     * Instantiates a new featureTarget and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public FeatureTarget() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.featureTarget");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a featureTarget
     */
    @javax.annotation.Nonnull
    public static FeatureTarget createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FeatureTarget();
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
        final FeatureTarget currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(3);
        deserializerMap.put("id", (n) -> { currentObject.setId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("targetType", (n) -> { currentObject.setTargetType(n.getEnumValue(FeatureTargetType.class)); });
        return deserializerMap
    }
    /**
     * Gets the id property value. The ID of the entity that's targeted in the include or exclude rule, or all_users to target all users.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this._id;
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
     * Gets the targetType property value. The kind of entity that's targeted. The possible values are: group, administrativeUnit, role, unknownFutureValue.
     * @return a featureTargetType
     */
    @javax.annotation.Nullable
    public FeatureTargetType getTargetType() {
        return this._targetType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("targetType", this.getTargetType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the id property value. The ID of the entity that's targeted in the include or exclude rule, or all_users to target all users.
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final String value) {
        this._id = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the targetType property value. The kind of entity that's targeted. The possible values are: group, administrativeUnit, role, unknownFutureValue.
     * @param value Value to set for the targetType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetType(@javax.annotation.Nullable final FeatureTargetType value) {
        this._targetType = value;
    }
}
