package com.microsoft.graph.security.cases.ediscoverycases.item.searches.item.purgedata;

import com.microsoft.graph.models.security.PurgeAreas;
import com.microsoft.graph.models.security.PurgeType;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the purgeData method. */
public class PurgeDataPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The purgeAreas property */
    private PurgeAreas _purgeAreas;
    /** The purgeType property */
    private PurgeType _purgeType;
    /**
     * Instantiates a new purgeDataPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PurgeDataPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a purgeDataPostRequestBody
     */
    @javax.annotation.Nonnull
    public static PurgeDataPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PurgeDataPostRequestBody();
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
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(2);
        deserializerMap.put("purgeAreas", (n) -> { this.setPurgeAreas(n.getEnumValue(PurgeAreas.class)); });
        deserializerMap.put("purgeType", (n) -> { this.setPurgeType(n.getEnumValue(PurgeType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the purgeAreas property value. The purgeAreas property
     * @return a purgeAreas
     */
    @javax.annotation.Nullable
    public PurgeAreas getPurgeAreas() {
        return this._purgeAreas;
    }
    /**
     * Gets the purgeType property value. The purgeType property
     * @return a purgeType
     */
    @javax.annotation.Nullable
    public PurgeType getPurgeType() {
        return this._purgeType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("purgeAreas", this.getPurgeAreas());
        writer.writeEnumValue("purgeType", this.getPurgeType());
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
     * Sets the purgeAreas property value. The purgeAreas property
     * @param value Value to set for the purgeAreas property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPurgeAreas(@javax.annotation.Nullable final PurgeAreas value) {
        this._purgeAreas = value;
    }
    /**
     * Sets the purgeType property value. The purgeType property
     * @param value Value to set for the purgeType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPurgeType(@javax.annotation.Nullable final PurgeType value) {
        this._purgeType = value;
    }
}
