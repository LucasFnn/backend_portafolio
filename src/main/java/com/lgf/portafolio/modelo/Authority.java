
package com.lgf.portafolio.modelo;

import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author Lucas Fanin
 */
public class Authority implements GrantedAuthority{
    
    private String authority;

    public Authority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() { 
        return this.authority;
    }
    
}
