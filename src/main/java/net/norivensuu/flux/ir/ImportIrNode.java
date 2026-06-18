package net.norivensuu.flux.ir;

import net.norivensuu.flux.antlr.FluxParser;
import net.norivensuu.flux.compiler.FluxIr;

public class ImportIrNode extends FluxIr.IrNode<String, FluxParser.ImportDeclContext> {
    public ImportIrNode(FluxIr<String> ir, FluxParser.ImportDeclContext ctx) {
        super(ir, ctx);
    }

    @Override
    public String getBaseToken() {
        return "import";
    }
}
