package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrinterCreateOperation extends PrintOperation implements Parsable {
    /** The signed certificate created during the registration process. Read-only. */
    private String _certificate;
    /** The created printer entity. Read-only. */
    private Printer _printer;
    /**
     * Instantiates a new PrinterCreateOperation and sets the default values.
     * @return a void
     */
    public PrinterCreateOperation() {
        super();
        this.setOdataType("#microsoft.graph.printerCreateOperation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PrinterCreateOperation
     */
    @javax.annotation.Nonnull
    public static PrinterCreateOperation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrinterCreateOperation();
    }
    /**
     * Gets the certificate property value. The signed certificate created during the registration process. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificate() {
        return this._certificate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PrinterCreateOperation currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("certificate", (n) -> { currentObject.setCertificate(n.getStringValue()); });
            this.put("printer", (n) -> { currentObject.setPrinter(n.getObjectValue(Printer::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the printer property value. The created printer entity. Read-only.
     * @return a printer
     */
    @javax.annotation.Nullable
    public Printer getPrinter() {
        return this._printer;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("certificate", this.getCertificate());
        writer.writeObjectValue("printer", this.getPrinter());
    }
    /**
     * Sets the certificate property value. The signed certificate created during the registration process. Read-only.
     * @param value Value to set for the certificate property.
     * @return a void
     */
    public void setCertificate(@javax.annotation.Nullable final String value) {
        this._certificate = value;
    }
    /**
     * Sets the printer property value. The created printer entity. Read-only.
     * @param value Value to set for the printer property.
     * @return a void
     */
    public void setPrinter(@javax.annotation.Nullable final Printer value) {
        this._printer = value;
    }
}
