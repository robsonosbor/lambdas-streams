package entities.validators;


/**
 * Essa	 anotação	 serve	 apenas	 para	 que	 ninguém	 torne	 aquela
*  interface	 em	 não	 funcional	 acidentalmente.
 * @param <T>
 */
@FunctionalInterface
public interface Validator <T>{
	boolean valida(T t);
}
