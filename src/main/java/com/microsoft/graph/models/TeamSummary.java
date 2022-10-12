package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamSummary implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The guestsCount property */
    private Integer _guestsCount;
    /** The membersCount property */
    private Integer _membersCount;
    /** The ownersCount property */
    private Integer _ownersCount;
    /**
     * Instantiates a new teamSummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamSummary
     */
    @javax.annotation.Nonnull
    public static TeamSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamSummary();
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
        final TeamSummary currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("guestsCount", (n) -> { currentObject.setGuestsCount(n.getIntegerValue()); });
            this.put("membersCount", (n) -> { currentObject.setMembersCount(n.getIntegerValue()); });
            this.put("ownersCount", (n) -> { currentObject.setOwnersCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the guestsCount property value. The guestsCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getGuestsCount() {
        return this._guestsCount;
    }
    /**
     * Gets the membersCount property value. The membersCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMembersCount() {
        return this._membersCount;
    }
    /**
     * Gets the ownersCount property value. The ownersCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getOwnersCount() {
        return this._ownersCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("guestsCount", this.getGuestsCount());
        writer.writeIntegerValue("membersCount", this.getMembersCount());
        writer.writeIntegerValue("ownersCount", this.getOwnersCount());
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
     * Sets the guestsCount property value. The guestsCount property
     * @param value Value to set for the guestsCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGuestsCount(@javax.annotation.Nullable final Integer value) {
        this._guestsCount = value;
    }
    /**
     * Sets the membersCount property value. The membersCount property
     * @param value Value to set for the membersCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMembersCount(@javax.annotation.Nullable final Integer value) {
        this._membersCount = value;
    }
    /**
     * Sets the ownersCount property value. The ownersCount property
     * @param value Value to set for the ownersCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwnersCount(@javax.annotation.Nullable final Integer value) {
        this._ownersCount = value;
    }
}
