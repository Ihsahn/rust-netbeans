/**
 * Copyright (C) 2013 drrb
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.drrb.rust.netbeans;

import org.netbeans.api.lexer.Language;
import org.netbeans.modules.csl.spi.DefaultLanguageConfig;
import org.netbeans.modules.csl.spi.LanguageRegistration;
import org.netbeans.modules.parsing.spi.Parser;
import org.openide.util.NbBundle;

@LanguageRegistration(mimeType = RustLanguage.MIME_TYPE)
public class RustLanguage extends DefaultLanguageConfig {
    
    public static final String MIME_TYPE = "text/x-rust-source";

    @Override
    public String getDisplayName() {
        return NbBundle.getMessage(RustLanguage.class, MIME_TYPE);
    }

    @Override
    public Language<RustTokenId> getLexerLanguage() {
        return RustTokenId.getLanguage();
    }
    
    @Override
    public Parser getParser() {
        return new NetbeansRustParser();
    }
}