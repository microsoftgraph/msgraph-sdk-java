package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AgreementFileData implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Data that represents the terms of use PDF document. Read-only. Note: You can use the .NET Convert.ToBase64String method to convert your file to binary data for uploading using the Create agreements API. A sample syntax using this method in PowerShell is [convert]::ToBase64String((Get-Content -path 'your_file_path' -Encoding byte)). */
    private byte[] _data;
    /**
     * Instantiates a new agreementFileData and sets the default values.
     * @return a void
     */
    public AgreementFileData() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a agreementFileData
     */
    @javax.annotation.Nonnull
    public static AgreementFileData createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AgreementFileData();
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
     * Gets the data property value. Data that represents the terms of use PDF document. Read-only. Note: You can use the .NET Convert.ToBase64String method to convert your file to binary data for uploading using the Create agreements API. A sample syntax using this method in PowerShell is [convert]::ToBase64String((Get-Content -path 'your_file_path' -Encoding byte)).
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getData() {
        return this._data;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AgreementFileData currentObject = this;
        return new HashMap<>(1) {{
            this.put("data", (n) -> { currentObject.setData(n.getByteArrayValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeByteArrayValue("data", this.getData());
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
     * Sets the data property value. Data that represents the terms of use PDF document. Read-only. Note: You can use the .NET Convert.ToBase64String method to convert your file to binary data for uploading using the Create agreements API. A sample syntax using this method in PowerShell is [convert]::ToBase64String((Get-Content -path 'your_file_path' -Encoding byte)).
     * @param value Value to set for the data property.
     * @return a void
     */
    public void setData(@javax.annotation.Nullable final byte[] value) {
        this._data = value;
    }
}
