SELECT
    sample_id,
    dna_sequence,
    species,

    -- starts with ATG
    CASE 
        WHEN dna_sequence LIKE 'ATG%' THEN 1 
        ELSE 0 
    END AS has_start,

    -- ends with TAA, TAG, or TGA
    CASE 
        WHEN dna_sequence REGEXP 'TAA$|TAG$|TGA$' THEN 1
        ELSE 0
    END AS has_stop,

    -- contains ATAT
    CASE 
        WHEN dna_sequence LIKE '%ATAT%' THEN 1
        ELSE 0
    END AS has_atat,

    -- contains at least 3 consecutive G
    CASE 
        WHEN dna_sequence REGEXP 'G{3,}' THEN 1
        ELSE 0
    END AS has_ggg

FROM Samples
ORDER BY sample_id;