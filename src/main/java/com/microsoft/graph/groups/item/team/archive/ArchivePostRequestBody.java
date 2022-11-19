package com.microsoft.graph.groups.item.team.archive;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the archive method. */
public class ArchivePostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The shouldSetSpoSiteReadOnlyForMembers property */
    private Boolean _shouldSetSpoSiteReadOnlyForMembers;
    /**
     * Instantiates a new archivePostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ArchivePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a archivePostRequestBody
     */
    @javax.annotation.Nonnull
    public static ArchivePostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ArchivePostRequestBody();
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
        final ArchivePostRequestBody currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(1);
        deserializerMap.put("shouldSetSpoSiteReadOnlyForMembers", (n) -> { currentObject.setShouldSetSpoSiteReadOnlyForMembers(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the shouldSetSpoSiteReadOnlyForMembers property value. The shouldSetSpoSiteReadOnlyForMembers property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShouldSetSpoSiteReadOnlyForMembers() {
        return this._shouldSetSpoSiteReadOnlyForMembers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("shouldSetSpoSiteReadOnlyForMembers", this.getShouldSetSpoSiteReadOnlyForMembers());
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
     * Sets the shouldSetSpoSiteReadOnlyForMembers property value. The shouldSetSpoSiteReadOnlyForMembers property
     * @param value Value to set for the shouldSetSpoSiteReadOnlyForMembers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShouldSetSpoSiteReadOnlyForMembers(@javax.annotation.Nullable final Boolean value) {
        this._shouldSetSpoSiteReadOnlyForMembers = value;
    }
}
