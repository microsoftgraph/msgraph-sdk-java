package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains return code properties for a Win32 App */
public class Win32LobAppReturnCode implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /** Return code. */
    private Integer _returnCode;
    /** Indicates the type of return code. */
    private Win32LobAppReturnCodeType _type;
    /**
     * Instantiates a new win32LobAppReturnCode and sets the default values.
     * @return a void
     */
    public Win32LobAppReturnCode() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.win32LobAppReturnCode");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a win32LobAppReturnCode
     */
    @javax.annotation.Nonnull
    public static Win32LobAppReturnCode createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Win32LobAppReturnCode();
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
        final Win32LobAppReturnCode currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("returnCode", (n) -> { currentObject.setReturnCode(n.getIntegerValue()); });
            this.put("type", (n) -> { currentObject.setType(n.getEnumValue(Win32LobAppReturnCodeType.class)); });
        }};
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
     * Gets the returnCode property value. Return code.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getReturnCode() {
        return this._returnCode;
    }
    /**
     * Gets the type property value. Indicates the type of return code.
     * @return a win32LobAppReturnCodeType
     */
    @javax.annotation.Nullable
    public Win32LobAppReturnCodeType getType() {
        return this._type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("returnCode", this.getReturnCode());
        writer.writeEnumValue("type", this.getType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the returnCode property value. Return code.
     * @param value Value to set for the returnCode property.
     * @return a void
     */
    public void setReturnCode(@javax.annotation.Nullable final Integer value) {
        this._returnCode = value;
    }
    /**
     * Sets the type property value. Indicates the type of return code.
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final Win32LobAppReturnCodeType value) {
        this._type = value;
    }
}
