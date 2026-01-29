package net.norivensuu.flux;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashSet;
import java.util.Set;

public class FluxMetadata {
    public boolean top = false; // Overrides libraries in the subfolders
    public Set<String> imports = new HashSet<>();

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public FluxMetadata(boolean top, Set<String> imports) {
        this.top = top;
        this.imports = imports;
    }
    public FluxMetadata(boolean top) {
        this.top = top;
    }
    public FluxMetadata(Set<String> imports) {
        this.imports = imports;
    }
    public FluxMetadata() {
    }

    public FluxMetadata appendDefault() {
        var meta = new FluxMetadata(top, imports);
        meta.imports.add("java.util.*");
        meta.imports.add("java.io.*");
        return meta;
    }

    public String toJson() {
        return gson.toJson(this);
    }

    public static FluxMetadata fromJson(String json) {
        return gson.fromJson(json, FluxMetadata.class);
    }

    @Override
    public String toString() {
        return toJson();
    }
}