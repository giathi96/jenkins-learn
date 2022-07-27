features = [["feature_name":"Chat", "value" : "chat"],
["feature_name":"Voice", "value" : "voice"],
["feature_name":"Email", "value" : "email"],
["feature_name":"Messaging","value" : "messaging"],
]
html ="""
<table>
"""
if (Task != "skip" ) {
    features.each { feature ->
        html ="""
        ${html}
        <tr>
            <td><input name='value' alt='${feature.value}' json='${feature.value}' type='checkbox' class='' value='${feature.value}'><label title='${feature.value}'>${feature.feature_name}</label></td> 
        </tr>
    
        """
    }
} else {
html = """<div>
${html}
<tr>
                  <td><span class="features_des">This select does not available for task is Skip</span></td>
</tr>"""
}
    html ="""
    ${html}
    </table>      
    """
return html