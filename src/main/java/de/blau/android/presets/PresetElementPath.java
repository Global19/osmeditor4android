package de.blau.android.presets;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;

/**
 * Container for the path to a specific PresetElement
 * 
 * @author simon
 *
 */
public class PresetElementPath implements Serializable {

    private static final long serialVersionUID = 1L;

    private final List<String> path;

    /**
     * Construct an empty PresetElementPath
     */
    public PresetElementPath() {
        path = new ArrayList<>();
    }

    /**
     * Construct an PresetElementPath from a List of path element
     * 
     * @param path a List of Strings representing the path
     */
    public PresetElementPath(@NonNull List<String> path) {
        this.path = new ArrayList<>(path);
    }

    /**
     * Construct a PresetElementPath from an existing one
     * 
     * @param existingPath the existing PresetElementPath
     */
    public PresetElementPath(PresetElementPath existingPath) {
        path = new ArrayList<>(existingPath.path);
    }

    /**
     * Get the elements of the path as a List
     * 
     * @return a List of the path elements
     */
    @NonNull
    List<String> getPath() {
        return path;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (String s : path) {
            result.append(s);
            result.append('|');
        }
        return result.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((path == null) ? 0 : path.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PresetElementPath)) {
            return false;
        }
        PresetElementPath other = (PresetElementPath) obj;
        if (path == null) {
            if (other.path != null) {
                return false;
            }
        } else if (!path.equals(other.path)) {
            return false;
        }
        return true;
    }
}
