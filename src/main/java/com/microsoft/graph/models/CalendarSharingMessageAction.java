package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CalendarSharingMessageAction implements AdditionalDataHolder, Parsable {
    /** The action property */
    private CalendarSharingAction _action;
    /** The actionType property */
    private CalendarSharingActionType _actionType;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The importance property */
    private CalendarSharingActionImportance _importance;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new calendarSharingMessageAction and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CalendarSharingMessageAction() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.calendarSharingMessageAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a calendarSharingMessageAction
     */
    @javax.annotation.Nonnull
    public static CalendarSharingMessageAction createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CalendarSharingMessageAction();
    }
    /**
     * Gets the action property value. The action property
     * @return a calendarSharingAction
     */
    @javax.annotation.Nullable
    public CalendarSharingAction getAction() {
        return this._action;
    }
    /**
     * Gets the actionType property value. The actionType property
     * @return a calendarSharingActionType
     */
    @javax.annotation.Nullable
    public CalendarSharingActionType getActionType() {
        return this._actionType;
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
        final CalendarSharingMessageAction currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
        deserializerMap.put("action", (n) -> { currentObject.setAction(n.getEnumValue(CalendarSharingAction.class)); });
        deserializerMap.put("actionType", (n) -> { currentObject.setActionType(n.getEnumValue(CalendarSharingActionType.class)); });
        deserializerMap.put("importance", (n) -> { currentObject.setImportance(n.getEnumValue(CalendarSharingActionImportance.class)); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the importance property value. The importance property
     * @return a calendarSharingActionImportance
     */
    @javax.annotation.Nullable
    public CalendarSharingActionImportance getImportance() {
        return this._importance;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("action", this.getAction());
        writer.writeEnumValue("actionType", this.getActionType());
        writer.writeEnumValue("importance", this.getImportance());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the action property value. The action property
     * @param value Value to set for the action property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAction(@javax.annotation.Nullable final CalendarSharingAction value) {
        this._action = value;
    }
    /**
     * Sets the actionType property value. The actionType property
     * @param value Value to set for the actionType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActionType(@javax.annotation.Nullable final CalendarSharingActionType value) {
        this._actionType = value;
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
     * Sets the importance property value. The importance property
     * @param value Value to set for the importance property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImportance(@javax.annotation.Nullable final CalendarSharingActionImportance value) {
        this._importance = value;
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
}
