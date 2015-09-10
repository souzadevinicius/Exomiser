/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.charite.compbio.exomiser.core.factories;

import de.charite.compbio.exomiser.core.model.Variant;
import de.charite.compbio.exomiser.core.model.frequency.FrequencyData;
import de.charite.compbio.exomiser.core.model.frequency.FrequencySource;
import de.charite.compbio.exomiser.core.model.pathogenicity.PathogenicityData;
import de.charite.compbio.exomiser.core.model.pathogenicity.PathogenicitySource;
import de.charite.compbio.jannovar.annotation.VariantEffect;
import java.util.Set;

/**
 *
 * @author Jules Jacobsen <jules.jacobsen@sanger.ac.uk>
 */
public interface VariantDataService {

    public FrequencyData getVariantFrequencyData(Variant variant, Set<FrequencySource> frequencySources);

    public PathogenicityData getVariantPathogenicityData(Variant variant, Set<PathogenicitySource> pathogenicitySources);

    public VariantEffect getVariantRegulatoryFeatureData(Variant variant);
    
//TODO: this is messy - only want one PathogenicityData call here.
//    public PathogenicityData getVariantCaddData(Variant variant);
//    public PathogenicityData getVariantNcdsData(Variant variant);
//
//    public void setVariantCaddData(VariantEvaluation variantEvaluation);
//    public void setVariantNcdsData(VariantEvaluation variantEvaluation);
//    
//    public void setVariantFrequencyData(VariantEvaluation variantEvaluation);
//
//    public void setVariantPathogenicityData(VariantEvaluation variantEvaluation);
//    
//    public void setVariantRegulatoryFeatureData(VariantEvaluation variantEvaluation);
        
}
