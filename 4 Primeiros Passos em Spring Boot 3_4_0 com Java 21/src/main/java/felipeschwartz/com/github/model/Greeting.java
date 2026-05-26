package felipeschwartz.com.github.model;

import java.io.Serializable;

public record Greeting(Long id, String content) implements Serializable {
}
