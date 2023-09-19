package com.microsoft.graph.security.cases.ediscoverycases.item.searches.item.microsoftgraphsecuritypurgedata;

import com.microsoft.graph.models.security.PurgeAreas;
import com.microsoft.graph.models.security.PurgeType;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PurgeDataPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The purgeAreas property
     */
    private EnumSet<PurgeAreas> purgeAreas;
    /**
     * The purgeType property
     */
    private PurgeType purgeType;
    /**
     * Instantiates a new purgeDataPostRequestBody and sets the default values.
     */
    public PurgeDataPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a purgeDataPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static PurgeDataPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PurgeDataPostRequestBody();
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
        deserializerMap.put("purgeAreas", (n) -> { this.setPurgeAreas(n.getEnumSetValue(PurgeAreas.class)); });
        deserializerMap.put("purgeType", (n) -> { this.setPurgeType(n.getEnumValue(PurgeType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the purgeAreas property value. The purgeAreas property
     * @return a purgeAreas
     */
    @jakarta.annotation.Nullable
    public EnumSet<PurgeAreas> getPurgeAreas() {
        return this.purgeAreas;
    }
    /**
     * Gets the purgeType property value. The purgeType property
     * @return a purgeType
     */
    @jakarta.annotation.Nullable
    public PurgeType getPurgeType() {
        return this.purgeType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumSetValue("purgeAreas", this.getPurgeAreas());
        writer.writeEnumValue("purgeType", this.getPurgeType());
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
     * Sets the purgeAreas property value. The purgeAreas property
     * @param value Value to set for the purgeAreas property.
     */
    public void setPurgeAreas(@jakarta.annotation.Nullable final EnumSet<PurgeAreas> value) {
        this.purgeAreas = value;
    }
    /**
     * Sets the purgeType property value. The purgeType property
     * @param value Value to set for the purgeType property.
     */
    public void setPurgeType(@jakarta.annotation.Nullable final PurgeType value) {
        this.purgeType = value;
    }
}
